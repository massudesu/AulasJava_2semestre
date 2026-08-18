public class Bichinho {

    private String nome;
    private Integer fome;
    private Integer energia;
    private String humor;
    private String fomesituacao;
    private String energiaSituacao;

    // Construtor
    public Bichinho(String nome, Integer fome, Integer energia) {
        this.nome = nome;
        setFome(fome);
        setEnergia(energia);
        getHumor();
        getFomeSituacao();
        getEnergiaSituacao();
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public Integer getFome() {
        return fome;
    }

    public Integer getEnergia() {
        return energia;
    }

    public String getFomeSituacao() {
        if (fome <= 50) {
            fomesituacao = "SACIADO";
        } else {
            fomesituacao = "FAMINTO";
        }

        return fomesituacao;
    }

    public String getEnergiaSituacao() {
        if (energia <= 50) {
            energiaSituacao = "ESGOTADO";
        } else {
            energiaSituacao = "PILHADO";
        }

        return energiaSituacao;
    }

    public String getHumor() {

        if (fome <=50 && energia >=75) {
            humor = "Sem fome e muito feliz";
        }else if (fome <=50 && energia <=75) {
            humor = "Sem fome mas está ok";
        }else if (fome >=50 && energia >=75) {
            humor = "Com fome mas com energia";
        }else if (fome <=50 && energia <=75) {
            humor = "Com fome e cansado";
        }else {
            humor = "FAMINTO E INFELIZ";
        }
        return humor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFome(Integer fome) {

        if (fome >= 0 && fome  <=100) {
            this.fome = fome;

        }
    }

    public void setEnergia(Integer energia) {

        if (energia < 0) {
            this.energia = 0;

        } else if (energia > 100) {
            this.energia = 100;

        } else {
            this.energia = energia;
        }
    }

    @Override
    public String toString() {

        return "Bichinho: " +
                "\n nome = " + nome +
                "\n fome = " + fome + " (" + getFomeSituacao() + ")" +
                "\n energia = " + energia + " (" + getEnergiaSituacao() + ")" +
                "\n humor = " + getHumor();
    }
}