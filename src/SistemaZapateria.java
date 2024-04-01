import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class SistemaZapateria {
    
      private static String nombreUsuario;

    public static void setNombreUsuario(String usuario) {
        nombreUsuario = usuario;
    }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }
    private static final String USUARIO_ARCHIVO = "usuario.txt";
    private static final String CONTRASEÑA_ARCHIVO = "contraseña.txt";
    private static final int MAX_INTENTOS = 3;
    
    
public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        int intentosUsuario = 0;
        int intentosContraseña = 0;
        String usuarioIngresado = null;
        while (true) {
            if (!verificarUsuario()) {
                agregarUsuario();
            }
            usuarioIngresado = pedirUsuario();
            if (verificarUsuario(usuarioIngresado)) {
                SistemaZapateria.setNombreUsuario(usuarioIngresado); // Establecer el nombre de usuario
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
                intentosUsuario++;
                if (intentosUsuario >= MAX_INTENTOS) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Desea restablecer el usuario?", "Restablecer Usuario", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        String contraseña = pedirContraseña();
                        if (verificarContraseña(contraseña)) {
                            restablecerUsuario();
                            intentosUsuario = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                            intentosContraseña++;
                            if (intentosContraseña >= MAX_INTENTOS) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        while (true) {
            if (verificarContraseña()) {
                Interfaz interfaz = new Interfaz();
                interfaz.setVisible(true);
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                intentosContraseña++;
                if (intentosContraseña >= MAX_INTENTOS) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Desea restablecer la contraseña?", "Restablecer Contraseña", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        restablecerContraseña();
                        intentosContraseña = 0;
                    } else {
                        return;
                    }
                }
            }
        }
    });
}


    private static boolean verificarUsuario() {
        File archivo = new File(USUARIO_ARCHIVO);
        return archivo.exists();
    }

    private static void agregarUsuario() {
        String usuario = JOptionPane.showInputDialog(null, "Configuración de Usuario:\nIngrese el nombre de usuario:", "Configuración", JOptionPane.PLAIN_MESSAGE);
        try (PrintWriter writer = new PrintWriter(USUARIO_ARCHIVO)) {
            writer.println(usuario);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static boolean verificarUsuario(String usuarioIngresado) {
        try (Scanner scanner = new Scanner(new File(USUARIO_ARCHIVO))) {
            String usuarioGuardado = scanner.nextLine();
            return usuarioIngresado.equals(usuarioGuardado);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean verificarContraseña() {
        File archivo = new File(CONTRASEÑA_ARCHIVO);
        if (!archivo.exists()) {
            crearContraseña();
        }

        String contraseñaGuardada = leerContraseña();
        if (contraseñaGuardada == null) {
            return false;
        }

        String contraseñaIngresada = pedirContraseña();
        return contraseñaIngresada.equals(contraseñaGuardada);
    }

    private static boolean verificarContraseña(String contraseña) {
        String contraseñaGuardada = leerContraseña();
        return contraseña.equals(contraseñaGuardada);
    }

    private static void crearContraseña() {
        String contraseña = JOptionPane.showInputDialog(null, "Configuración de Contraseña:\nIngrese la nueva contraseña:", "Configuración", JOptionPane.PLAIN_MESSAGE);
        try (PrintWriter writer = new PrintWriter(CONTRASEÑA_ARCHIVO)) {
            writer.println(contraseña);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String leerContraseña() {
        try (Scanner scanner = new Scanner(new File(CONTRASEÑA_ARCHIVO))) {
            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String pedirContraseña() {
        return JOptionPane.showInputDialog(null, "Por favor, ingrese la contraseña:", "Autenticación", JOptionPane.PLAIN_MESSAGE);
    }

    private static String pedirUsuario() {
        return JOptionPane.showInputDialog(null, "Por favor, ingrese el nombre de usuario:", "Autenticación", JOptionPane.PLAIN_MESSAGE);
    }

    private static void restablecerContraseña() {
        String contraseñaActual = pedirContraseña();
        String contraseñaGuardada = leerContraseña();
        if (contraseñaActual.equals(contraseñaGuardada)) {
            String nuevaContraseña = JOptionPane.showInputDialog(null, "Ingrese la nueva contraseña:", "Restablecer Contraseña", JOptionPane.PLAIN_MESSAGE);
            try (PrintWriter writer = new PrintWriter(CONTRASEÑA_ARCHIVO)) {
                writer.println(nuevaContraseña);
                JOptionPane.showMessageDialog(null, "Contraseña restablecida exitosamente", "Restablecer Contraseña", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña actual es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void restablecerUsuario() {
        String nuevoUsuario = JOptionPane.showInputDialog(null, "Ingrese el nuevo usuario:", "Restablecer Usuario", JOptionPane.PLAIN_MESSAGE);
        try (PrintWriter writer = new PrintWriter(USUARIO_ARCHIVO)) {
            writer.println(nuevoUsuario);
            JOptionPane.showMessageDialog(null, "Usuario restablecido exitosamente", "Restablecer Usuario", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

