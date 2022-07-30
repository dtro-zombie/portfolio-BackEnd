package com.myportfoliona.nahuel.arias.Security.Entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UsuarioPrincipal implements UserDetails {

    private String nombre;
    private String nombreusuario;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UsuarioPrincipal() {
    }

    public UsuarioPrincipal(String nombre, String nombreusuario, 
                            String email, String password
                            , Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreusuario = nombreusuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UsuarioPrincipal Build(Usuario usuario) {
        List<GrantedAuthority> authorities = usuario.getRoles().stream()
                .map(rol -> new SimpleGrantedAuthority(rol.getRolNOmbre().name())).collect(Collectors.toList());

        return new UsuarioPrincipal(usuario.getNombre(), usuario.getNombreUsuario(),
                 usuario.getEmail(), usuario.getPassword(), authorities);
    }

    @Override
    public String getUsername() {
        return nombreusuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {

        return password;
    }
    
     
    public String getNombre() {

        return nombre;
    }
    
     
    public String getEmail() {

        return email;
    }

}
