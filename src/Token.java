

public class Token {

    private Token() {};
    private static Token instance = new Token();
    public static Token getInstance() {
        return instance;
    }

    private String CPFUsuario;
    private String loginUsuario;

    public String getCPFUsuario() {
        return CPFUsuario;
    }

    public void setCPFUsuario(String CPFUsuario) {
        this.CPFUsuario = CPFUsuario;
    }

    public String getloginUsuario() {
        return loginUsuario;
    }

    public void setloginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }
}