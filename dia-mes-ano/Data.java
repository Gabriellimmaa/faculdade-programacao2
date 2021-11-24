public class Data
{
    int dia;
    int mes;
    int ano;
    
    Data(){
        dia = 1;
        mes = 1;
        ano = 2021;
    }

    Data(int ano){
        dia = 1;
        mes = 1;
        
        this.ano = ano;
    }
    
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String formatarData(String separador) {
        return this.dia + separador + this.mes + separador + this.ano;
    }
}
