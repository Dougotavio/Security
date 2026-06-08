
package Security.model.entity;

public class Usuario {

    private long    id;
    private String  nome;
    private String  cpf;
    private String  email;
    private String  sexo;
     private String senha;
    private String  lograduro;
    private String  cep;
    private String  bairro;
    private String  cidade;
    private boolean codStatus;
    private String  tipoUsuario; // Admin, Cliente ou Funcionario
    private String  uf;

    // Setter´s | Getter´s


    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public  String getnome(){
        return nome;
    }


     public void setcpf(String cpf){
        this.cpf = cpf;
    }

    public  String getcpf(){
        return cpf;
    }

     public void setemail(String email){
        this.email = email;
    }

    public  String getemail(){
        return email;
    }

     public void setsenha(String senha){
        this.senha = senha;
    }

    public  String getsenha(){
        return senha;
    }

     public void setsexo(String sexo){
        this.sexo = sexo;
    }

    public  String getsexo(){
        return sexo;
    }

    public void setlograduro(String lograduro){
        this.lograduro = lograduro;
    }

    public  String getlogradouro(){
        return lograduro;
    }

    public void setcep(String cep){
        this.cep = cep;
    }

    public  String getcep(){
        return cep;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public  String getbairro(){
   
        return bairro;
    }

    public void setcidade(String cidade){
        this.cidade = cidade;
    }

    public  String getcidade(){
        return cidade;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    





}
