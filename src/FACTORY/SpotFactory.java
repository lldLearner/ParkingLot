package FACTORY;

import MODELS.CompactSpot;
import MODELS.DisabledSpot;
import MODELS.LargeSpot;
import MODELS.MotorcycleSpot;
import MODELS.Spot;
import MODELS.SpotType;

public class SpotFactory {

	public static Spot createParkingSpot(String id, SpotType type) {
		// TODO Auto-generated method stu

		switch (type) {
		case COMPACT: {

			return new CompactSpot(id);
		}
		case LARGE: {

			return new LargeSpot(id);
		}
		case DISABLED: {

			return new DisabledSpot(id);
		}
		case MOTORCYCLE: {

			return new MotorcycleSpot(id);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
