import java.util.ArrayList;

public class SistemaCadastro {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }

        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    public void buscarUsuario(String nome) {
        for (Usuario u : usuarios) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Usuário encontrado:");
                System.out.println(u);
                return;
            }
        }

        System.out.println("Usuário não encontrado.");
    }

    public void removerUsuario(String nome) {
        for (Usuario u : usuarios) {
            if (u.getNome().equalsIgnoreCase(nome)) {
                usuarios.remove(u);
                System.out.println("Usuário removido.");
                return;
            }
        }

        System.out.println("Usuário não encontrado.");
    }
}