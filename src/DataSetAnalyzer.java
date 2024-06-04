import java.util.*;

public class DataSetAnalyzer {
    private double[] data;

    public DataSetAnalyzer(double[] data) {
        this.data = data;
    }

    // Método para verificar si el conjunto de datos es agrupado o no agrupado
    private boolean isGrouped() {
        Set<Double> uniqueValues = new HashSet<>();
        for (double value : data) {
            uniqueValues.add(value);
        }
        return uniqueValues.size() < data.length; // Si hay valores repetidos, es un conjunto agrupado
    }

    // Método para calcular la media
    public double calculateMean() {
        double sum = 0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }

    // Método para calcular la mediana
    public double calculateMedian() {
        double[] sortedData = Arrays.copyOf(data, data.length);
        Arrays.sort(sortedData);

        if (sortedData.length % 2 == 1) {
            return sortedData[sortedData.length / 2];
        } else {
            int midIndex = sortedData.length / 2;
            return (sortedData[midIndex - 1] + sortedData[midIndex]) / 2.0;
        }
    }

    // Método para calcular la moda
    public double calculateMode() {
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double value : data) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        double mode = 0;
        int maxFrequency = 0;
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mode = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        double[] dataSet = {12.5, 15.3, 20.7, 8.9, 14.2, 17.6};

        DataSetAnalyzer analyzer = new DataSetAnalyzer(dataSet);
        if (analyzer.isGrouped()) {
            System.out.println("Datos agrupados:");
        } else {
            System.out.println("Datos no agrupados:");
        }

        System.out.println("Media: " + analyzer.calculateMean());
        System.out.println("Mediana: " + analyzer.calculateMedian());
        System.out.println("Moda: " + analyzer.calculateMode());
    }
}
