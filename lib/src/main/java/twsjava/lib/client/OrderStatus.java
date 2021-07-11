package twsjava.lib.client;


public enum OrderStatus {
	ApiPending,
	ApiCancelled,
	PreSubmitted,
	PendingCancel,
	Cancelled,
	Submitted,
	Filled,
	Inactive,
	PendingSubmit,
	Unknown;

    public static OrderStatus get(String apiString) {
        for( OrderStatus type : values() ) {
            if( type.name().equalsIgnoreCase(apiString) ) {
                return type;
            }
        }
        return Unknown;
    }

	public boolean isActive() {
		return this == PreSubmitted || this == PendingCancel || this == Submitted || this == PendingSubmit;
	}
}
