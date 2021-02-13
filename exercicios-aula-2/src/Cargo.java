public enum Cargo {

        DESENVOLVEDOR (1.1, "Desenvolvedor"),
        LIDER_TECNICO (1.15, "Líder de Soluções"),
        ENGENHEIRO_SOLUCOES (1.2, "Engenheiro de Soluções");

        private double bonus;
        private String nomeCargo;

        // no enum Cargo é sempre private, sem possibilidade de alteração
        Cargo(double bonus, String nomeCargo){
            this.bonus = bonus;
            this.nomeCargo = nomeCargo;
        }

    public double getBonus() {
        return bonus;
    }
}
