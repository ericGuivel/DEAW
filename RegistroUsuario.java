public class RegistroUsuario {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public boolean registrarUsuario(String nombre, String email) {
        //  ERROR: no se valida el email
        if (nombre == null || nombre.isEmpty() || email == null || email.isEmpty()) {
            return false;
        }
        // Aquí se simula que el usuario queda registrado
        System.out.println("Usuario registrado: " + nombre + " con email " + email);
        return true;
    }
}
