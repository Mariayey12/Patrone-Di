package SingletonControlAccesoSistema;

class Door {
    private String doorId;
    private boolean isOpen;

    public Door(String doorId) {
        this.doorId = doorId;
        this.isOpen = false; // Por defecto, la puerta está cerrada.
    }

    public String getDoorId() {
        return doorId;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}

