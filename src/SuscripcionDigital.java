

    public class SuscripcionDigital {


        private final int id;
        private String nombreCliente;
        private int mesesDisponibles;
        private static int contadorSuscripciones = 0;

        // Constructor
        public SuscripcionDigital(int id, String nombreCliente) {
            if (id <= 0) {
                new IllegalArgumentException("ID invalido");
            }

            if (nombreCliente == null || nombreCliente.trim().isEmpty()) {
                 new IllegalArgumentException("Nombre invalido");
            }

            this.id = id;
            this.nombreCliente = nombreCliente;
            this.mesesDisponibles = 0;
            contadorSuscripciones++;
        }


        public int getId() {
            return id;
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public int getMesesDisponibles() {
            return mesesDisponibles;
        }

        // Setter del nombre
        public void setNombreCliente(String nombreCliente) {
            if (nombreCliente != null && !nombreCliente.trim().isEmpty()) {
                this.nombreCliente = nombreCliente;
            }
        }

        // Agregar meses
        public boolean agregarMeses(int meses) {
            if (meses <= 0 || meses > Integer.MAX_VALUE - mesesDisponibles) {
                return false;
            }

            mesesDisponibles += meses;
            return true;
        }

        //  un mes
        public boolean consumirMes() {
            if (mesesDisponibles <= 0) {
                return false;
            }

            mesesDisponibles--;
            return true;
        }

        // Contador compartido
        public static int getContadorSuscripciones() {
            return contadorSuscripciones;
        }
    }



