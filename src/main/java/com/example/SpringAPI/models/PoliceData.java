package com.example.SpringAPI.models;

/**
 * Created by Keith on 5/22/17.
 */
public class PoliceData {
    String category;
    String location_type;
    Location location;
    Outcome_status outcome_status;

    String month;

    public Outcome_status getOutcome_status() {
        return outcome_status;
    }

    public void setOutcome_status(Outcome_status outcome_status) {
        this.outcome_status = outcome_status;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static class Location {
        double latitude;
        double longitude;
        Street street;

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public Street getStreet() {
            return street;
        }

        public void setStreet(Street street) {
            this.street = street;
        }

        public static class Street {
            int id;
            String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return id + " " + name;
            }
        }
    }
    public static class Outcome_status {
        String category;

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        @Override
        public String toString() {
            return category;
        }
    }
}
