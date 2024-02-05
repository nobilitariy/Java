/* метод, вычисляющий скалярное произведение:
 
метод, вычисляющий векторное произведение с другим вектором:
 
метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
 
методы для суммы и разности:

*/
package seminar2.classWork;



public class classVector {
    private double x;
    private double y;
    private double z;

    public classVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
    public double len(){
        return Math.sqrt(x*x + y*y + z*z);
    }
/*
 * @param classVector2
 * @apiNote произведеие двух векторов
 *@return scaler prsv
 */
    public double skl(classVector classVector2) {
        return x*classVector2.x + y * classVector2.y + z*classVector2.z; 
        
    }
    
    public classVector mult(classVector classvVector2) {
        return new classVector(
            y*classvVector2.z - z*classvVector2.y,
            z*classvVector2.x - x*classvVector2.z,
            x*classvVector2.y - y*classvVector2.x
            );      
    }
    
    public double cos(classVector classVector2){
        return skl(classVector2) / (len()*classVector2.len());
    }
}
