public class CarClass {
    private double _carSpeed = 60d;
    private String _carModel = "X/125";

    public double GetCarSpeed() {
        return this._carSpeed;
    }

    private void SetCarSpeed(double speed) {
        if (speed > 0) {
            this._carSpeed = speed;
        }
    }

    CarClass() {
    }

    CarClass(double speed) {
        SetCarSpeed(speed);
    }
}
