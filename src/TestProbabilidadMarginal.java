public class TestProbabilidadMarginal {
    public static void main(String[] args) {
        double A1general = A1valorTotal();
        double A2general = A2valorTotal();
        double B1general = B1valorTotal();
        double B2general = B2valorTotal();
        double ABgeneral = ABvalorTotal();

        ValorA1ABgeneral(A1general, ABgeneral);
        ValorB1ABgeneral(B1general, ABgeneral);
        ValorA2ABgeneral(A2general, ABgeneral);
        ValorB2ABgeneral(B2general, ABgeneral);
    }

    public static double ABvalorTotal(){
        double ABgeneral = DataSet.abData[0][0] + DataSet.abData[0][1] + DataSet.abData[1][0] + DataSet.abData[1][1];
        return ABgeneral;
    }

    public static double A1valorTotal(){
        double A1general = DataSet.abData[0][0] + DataSet.abData[1][0];
        return A1general;
    }

    public static double A2valorTotal(){
        double A2general = DataSet.abData[0][0] + DataSet.abData[0][1];
        return A2general;
    }

    public static double B1valorTotal(){
        double B1general = DataSet.abData[0][1] + DataSet.abData[1][1];
        return B1general;
    }

    public static double B2valorTotal(){
        double B2general = DataSet.abData[1][0] + DataSet.abData[1][1];
        return B2general;
    }

    public static double ValorA1ABgeneral(double A1general, double ABgeneral){
        double A1ABgeneral = (A1general / ABgeneral) * 100;
        System.out.println("La probabilidad de que esté nublado es " + A1general + "/" + ABgeneral + "\nEn porcentaje sería el " + A1ABgeneral + "%");
        System.out.println("==================================================");
        return A1ABgeneral;
    }

    public static double ValorA2ABgeneral(double A2general, double ABgeneral){
        double A2ABgeneral = (A2general / ABgeneral) * 100;
        System.out.println("La probabilidad de que llueva es " + A2general + "/" + ABgeneral + "\nEn porcentaje sería el " + A2ABgeneral + "%");
        System.out.println("==================================================");
        return A2ABgeneral;
    }

    public static double ValorB1ABgeneral(double B1general, double ABgeneral){
        double B1ABgeneral = (B1general / ABgeneral) * 100;
        System.out.println("La probabilidad de que no esté nublado es " + B1general + "/" + ABgeneral + "\nEn porcentaje sería el " + B1ABgeneral + "%");
        System.out.println("==================================================");
        return B1ABgeneral;
    }

    public static double ValorB2ABgeneral(double B2general, double ABgeneral){
        double B2ABgeneral = (B2general / ABgeneral) * 100;
        System.out.println("La probabilidad de que no llueva es " + B2general + "/" + ABgeneral + "\nEn porcentaje sería el " + B2ABgeneral + "%");
        System.out.println("==================================================");
        return B2ABgeneral;
}
}