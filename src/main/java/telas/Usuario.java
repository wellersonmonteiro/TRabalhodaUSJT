package telas;

import java.util.Date;

public class Usuario {
    private int id;
    private String nomeCompleto;
    private String nomeApresentacao;
    private Date dataCadastro;
    private Date dataNascimento;
    private String cpf;
    private String email;
    private String empresa;
    private String cargo;
    private String telefoneComercial;
    private String username;
    private String password;
    private int fkDocumentos;


        private static Usuario usuarioAtual;



        public static String getUsuarioAtual() {
            return "'"+usuarioAtual.getUsername()+"'";
        }

        public static void setUsuarioAtual(Usuario usuario) {

            usuarioAtual = usuario;
        }




    public Usuario(int id, String nomeCompleto, String nomeApresentacao, Date dataCadastro, Date dataNascimento,
                   String cpf, String email, String empresa, String cargo, String telefoneComercial,
                   String username, String password, int fkDocumentos) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeApresentacao = nomeApresentacao;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.empresa = empresa;
        this.cargo = cargo;
        this.telefoneComercial = telefoneComercial;
        this.username = username;
        this.password = password;
        this.fkDocumentos = fkDocumentos;
    }

    public Usuario(String login){
        this.username = username;

    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeApresentacao() {
        return nomeApresentacao;
    }

    public void setNomeApresentacao(String nomeApresentacao) {
        this.nomeApresentacao = nomeApresentacao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFkDocumentos() {
        return fkDocumentos;
    }

    public void setFkDocumentos(int fkDocumentos) {
        this.fkDocumentos = fkDocumentos;
    }
    public boolean validarUsuario(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

}