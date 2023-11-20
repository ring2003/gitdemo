package features;

import features.FeatureResponse;

public interface Features {
	public String getName();
	public Boolean toggleFeature();
	public FeatureResponse execute();
}
