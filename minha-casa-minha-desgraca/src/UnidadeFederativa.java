public enum UnidadeFederativa {

    RS ("Rio Grande do Sul"),
    SC ("Santa Catarina"),
    PR ("Paraná"),
    SP ("São Paulo"),
    RJ ("Rio de Janeiro"),
    ES ("Espírito Santo"),
    MG ("Minas Gerais"),
    GO ("Goiás"),
    DF ("Distrito Federal"),
    MS ("Mato Grosso do Sul"),
    MT ("Mato Grosso"),
    BA ("Bahia"),
    SE ("Sergipe"),
    AL ("Alagoas"),
    PE ("Pernambuco"),
    PB ("Paraíba"),
    RN ("Rio Grande do Norte"),
    CE ("Ceará"),
    PI ("Piauí"),
    TO ("Tocantis"),
    MA ("Maranhão"),
    PA ("Pará"),
    AP ("Amapá"),
    AM ("Amazonas"),
    RR ("Roraima"),
    RO ("Rondônia"),
    AC ("Acre");

    private String descricao;

    UnidadeFederativa (String descricao) {
        this.descricao = descricao;
    }

}
