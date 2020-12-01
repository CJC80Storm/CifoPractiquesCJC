package plateDB;

public class LicensePlate {
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LicensePlate other = (LicensePlate) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (liNumber == null) {
			if (other.liNumber != null)
				return false;
		} else if (!liNumber.equals(other.liNumber))
			return false;
		return true;
	}

	private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

	public String getLiNumber() {
		return liNumber;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((liNumber == null) ? 0 : liNumber.hashCode());
		return result;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return country + " " + liNumber;
	}

	
	
	
}
