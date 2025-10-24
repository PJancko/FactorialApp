package src.main.java;

public class CalculadoraDescuentos {
    public double calcularPrecioFinal(double precioOriginal, double porcentajeDescuento) {
        // Validaciones
        if (precioOriginal <= 0) {
            throw new IllegalArgumentException("El precio original debe ser mayor que cero");
        }
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100");
        }

        // Calcular precio final
        double precioFinal = precioOriginal * (1 - (porcentajeDescuento / 100.0));

        // Redondear a 2 decimales
        precioFinal = Math.round(precioFinal * 100.0) / 100.0;

        return precioFinal;
    }
}
