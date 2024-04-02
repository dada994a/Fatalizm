package we.devs.forever.client.modules.impl.render.radar.util;

public class RadarRotationUtil {
    public float yaw;
    public float pitch;

    public float getPitch() {
        return this.pitch;
    }


    public RadarRotationUtil c(float var1, float var2) {
        return new RadarRotationUtil(var1, var2);
    }


    public static RadarRotationUtil c(RadarRotationUtil var0, float var1, float var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.yaw;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.pitch;
        }

        return var0.c(var1, var2);
    }

    public float meth2() {
        return this.yaw;
    }

    public RadarRotationUtil(float var1, float var2) {
        this.yaw = var1;
        this.pitch = var2;
    }

    public void setPitch(float var1) {
        this.pitch = var1;
    }

    public boolean c(RadarRotationUtil var1) {
        return var1.yaw == this.yaw && var1.pitch == this.pitch;
    }



    public int hashCode() {
        return Float.hashCode(this.yaw) * 31 + Float.hashCode(this.pitch);
    }



    public String toString() {
        return "RadarRotationUtil(yaw=" + this.yaw + ", pitch=" + this.pitch + ")";
    }



    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 instanceof RadarRotationUtil) {
                RadarRotationUtil var2 = (RadarRotationUtil)var1;
                if (Float.compare(this.yaw, var2.yaw) == 0 && Float.compare(this.pitch, var2.pitch) == 0) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}