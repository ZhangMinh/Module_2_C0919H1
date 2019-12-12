public class Point3D extends Point2D {
    private float z = 1.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super ( x, y );
        this.z = z;

    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getZYZ() {
        float[] xyz=new float[3];
        xyz[0]=super.getX ();
        xyz[1]=super.getY ();
        xyz[2]=this.getZ ();
        return xyz;
    }
    @Override
    public String toString() {
        return "(" + super.getX () +
                ", " + super.getY () + ", " + this.getZ () +")";
    }


}
