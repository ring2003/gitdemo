package features;

import features.Features;
import features.FeatureResponse;

public class CaclFeature() implements Features {
	public static String featureName = "Caculator";
	private Boolean featureEnabled = false;

	public String getName() { return featureName; }
	public Boolean toggleFeature() { 
		if (featureEnabled) {
			this.featureEnabled = false;
		} else {
			this.featureEnabled = true;
		}
		return this.featureEnabled;
	}
	public PublicResponse execute() {
		if (featureEnabled)  {
			throw new Exception("not implemented yet.");
		}
	}
}
