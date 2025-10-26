import com.figuras.figurasruntime.model.Figura

class Pentagono implements Figura {
    double lado

    Pentagono(double lado) {
        this.lado = lado
    }

    @Override
    String getNombre() {
        return "Pentágono remoto"
    }

    @Override
    double calcularArea() {
        // Fórmula aproximada: (1/4) * √(5(5 + 2√5)) * lado²
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado
    }

    @Override
    double calcularPerimetro() {
        return 5 * lado
    }
}
