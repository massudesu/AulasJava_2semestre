public class Bichinho {
    private String nome;
    private Integer fome;
    private Integer energia;
    private String humor;
    private String fomesituacao;
    private String energiaSituacao;

    // construtor
    public Bichinho(String nome, Integer fome, Integer energia, String humor) {
        this.nome = nome;
        this.fome = fome;
        this.energia=energia;
        getHumor(humor);


    }

    // getters
    public String getNome() {
        return nome;
    }
    public String getFomesituacao(){
        return fomesituacao;
    }
    public String getEnergiaSituacao(){
        return energiaSituacao;
    }
    public Integer getFome() {
        return fome;
    }

    public Integer getEnergia() {
        return energia;
    }

    public String getHumor() {
        return humor;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setFome(Integer fome) {
        if (fome < 0) {
            this.fome = 0;
        } else if (fome > 100) {
            this.fome = 100;
        } else {
            this.fome = fome;
        }
    }

    public void setEnergia(Integer energia) {
        if (energia <= 0) {
            this.energia = 0;
        } else if (energia > 100) {
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    public void getHumor(String humor) {
        if((fome + energia)>=75 ) {
            this.humor = "feliz";
        } else{
            this.humor="infeliz";
        }
    }

    public void setEnergiaSituacao(String energiaSituacao){
        if (fome <= 50){
            this.energiaSituacao = "ESGOTADO";
        }else{
            this.energiaSituacao = "PILHADO";
        }
    }

    public void setFomesituacao(String fomesituacao){
        if (fome <= 50){
            this.fomesituacao = "SACIADO";
        }else{
            this.fomesituacao = "FAMINTO";
        }
    }

    @Override
    public String toString() {
        return "Bichinho: " +
                "\n nome = " + nome +
                "\n fome = " + fome +"("+ fomesituacao +")"+
                "\n energia = " + energia +"("+ energiaSituacao +")"+
                "\n humor = " + humor;
    }
}
