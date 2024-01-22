package java.com.assetco.hotspots.optimization.test;

import java.util.ArrayList;
import java.util.List;

import com.assetco.search.results.Asset;
import com.assetco.search.results.AssetVendor;
import com.assetco.search.results.AssetVendorRelationshipLevel;
import com.assetco.search.results.Hotspot;
import com.assetco.search.results.HotspotKey;
import org.junit.jupiter.api.Test;

public class BugsTest {

    @Test
    public void precedingPartnerWithLongTrailingAssetsDoesNotWin(){
        AssetVendor partnerVendor = makeVendor(AssetVendorRelationshipLevel.Partner);
        AssetVendor otherVendor = makeVendor(AssetVendorRelationshipLevel.Partner);
        Asset missing = givenAssetsInResultWithVendor(partnerVendor);
        Asset alsoMissing = givenAssetsInResultWithVendor(otherVendor);
        List<Asset> expected = List.of(givenAssetsInResultWithVendor(partnerVendor),
            givenAssetsInResultWithVendor(partnerVendor),
            givenAssetsInResultWithVendor(partnerVendor),
            givenAssetsInResultWithVendor(partnerVendor));

        whenOptimize();
        thenHotspotDoesNotHave(HotspotKey.Showcase, missing);
        thenHotspotDoesHave(HotspotKey.Showcase, expected);
    }

    private void thenHotspotDoesHave(HotspotKey hotspotKey, List<Asset> expected) {
    }

    private void thenHotspotDoesNotHave(HotspotKey hotspotKey, Asset... expected) {
    }

    private void whenOptimize() {
    }

    private AssetVendor makeVendor(AssetVendorRelationshipLevel assetVendorRelationshipLevel) {
        return null;
    }

    private Asset givenAssetsInResultWithVendor(AssetVendor partnerVendor) {
        return null;
    }

}
