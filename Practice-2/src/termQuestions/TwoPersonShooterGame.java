package termQuestions;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

class Bullet implements Serializable, Cloneable{
    int _posX;
    int _posY;
    public Bullet(int initialX, int initialY){
        _posX = initialX;
        _posY = initialY;
    }
    @Override
    public String toString(){
        return "<" + _posX + ", " + _posY + ">";
    }
    public Object Clone(){
        return new Bullet(_posX, _posY);
    }
}

public class TwoPersonShooterGame {
    ObjectOutputStream _oos;
    ObjectInputStream _ois;
    public TwoPersonShooterGame(Socket socket) {
        try {
            _oos = new ObjectOutputStream(socket.getOutputStream());
            _ois = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void updateBullet(Bullet bullet, int x, int y) throws IOException{
        bullet._posX = x;
        bullet._posY = y;
        _oos.writeObject(bullet);
    }
    public Bullet receiveBulletFromNetwork(){
        try{
            return (Bullet) _ois.readObject();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
