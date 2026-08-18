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

        if ((fome + energia) >= 75) {
            humor = "FELIZ";
        } else {
            humor = "INFELIZ";
        }

        return humor;
    }

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