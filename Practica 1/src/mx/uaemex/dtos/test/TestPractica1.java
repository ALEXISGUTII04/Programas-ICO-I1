
package mx.uaemex.dtos.test;

import mx.uaemex.dtos.*;

public class TestPractica1 {
    
    public static void main(String[] args) {
testLogin();
testHackeo();
}
public static void testLogin() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.setUsuario("sofia");
sesionDeUsuario.setPassword("abcdef");
sesionDeUsuario.doLogin();
if(sesionDeUsuario.isLoggedIn()) {
System.out.println("Bienvenid@ "+sesionDeUsuario.getUsuario());
}else {
System.out.println("Su usuario o contraseña están equivocados");
}
}
public static void testHackeo() {
SesionDeUsuario sesionDeUsuario = new SesionDeUsuario();
sesionDeUsuario.getPassword();
sesionDeUsuario.setLoggedIn(true);
}
}

