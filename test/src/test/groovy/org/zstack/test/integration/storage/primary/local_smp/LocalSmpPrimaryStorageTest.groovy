package org.zstack.test.integration.storage.primary.local_smp

import org.zstack.test.integration.storage.StorageTest
import org.zstack.testlib.Test

/**
 * Created by lining on 2017/2/27.
 */
class LocalSmpPrimaryStorageTest extends Test {

    @Override
    void setup() {
        useSpring(StorageTest.springSpec)
    }

    @Override
    void environment() {
    }

    @Override
    void test() {
        runSubCases()
    }
}
