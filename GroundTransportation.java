public class GroundTransportation extends Transport{

    private static final double groundFees= 0.03;
    public GroundTransportation(){
        super();
        super.setFees(groundFees);
        String licensePlate;
    }

    @Override
    public String getTransportType(){
        return "ground transport";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", getId()));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));

        return sb.toString();
    }
}
