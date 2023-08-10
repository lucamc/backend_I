public class Computadora {

    private String id;
    private int ram;
    private int hdd;

    public Computadora(String id, int ram, int hdd) {
        this.id = id;
        this.ram = ram;
        this.hdd = hdd;
    }


    @Override
    public String toString() {
        return "Computadora{" +
                "id='" + id + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    // Getters and Setters
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
