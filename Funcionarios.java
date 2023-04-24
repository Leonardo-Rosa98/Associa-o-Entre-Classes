public class Funcionarios {
        private String nome;
        private Departamento departamento;

        public Funcionarios(String nome, Departamento departamento){
            this.nome = nome;
            this.departamento = departamento;
        }
        public String getNome(){
            return nome;
        }

        public Departamento getDepartamento(){
            return departamento;    
        }

        public void setDepartamento(Departamento departamento){
            this.departamento = departamento;
        }
}
