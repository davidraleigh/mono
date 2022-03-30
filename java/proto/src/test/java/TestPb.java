import geo.v1.EnvelopeData;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestPb {
    @Test
    public void testEnvelope() {
        EnvelopeData envelopeData = EnvelopeData.newBuilder().setXmin(99).build();
        assertEquals(envelopeData.getXmin(), 99.0);
    }
}
