package sk.upjs.ics.paz1c.debilnicek;

public enum UlohaDaoFactory {
    
    INSTANCE;
    
    public UlohaDao getUlohaDao(){
        return new SuborovyUlohaDao();
    }
    
}
