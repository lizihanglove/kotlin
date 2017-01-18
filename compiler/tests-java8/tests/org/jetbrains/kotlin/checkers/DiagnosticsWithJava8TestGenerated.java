/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/testsWithJava8")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticsWithJava8TestGenerated extends AbstractDiagnosticsWithFullJdkTest {
    public void testAllFilesPresentInTestsWithJava8() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("nullForOptionalOrElse.kt")
    public void testNullForOptionalOrElse() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/nullForOptionalOrElse.kt");
        doTest(fileName);
    }

    @TestMetadata("samWithConsumer.kt")
    public void testSamWithConsumer() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/samWithConsumer.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJava8/annotations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Annotations extends AbstractDiagnosticsWithFullJdkTest {
        public void testAllFilesPresentInAnnotations() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/annotations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("deprecatedRepeatable.kt")
        public void testDeprecatedRepeatable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/deprecatedRepeatable.kt");
            doTest(fileName);
        }

        @TestMetadata("javaRepeatable.kt")
        public void testJavaRepeatable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/javaRepeatable.kt");
            doTest(fileName);
        }

        @TestMetadata("javaRepeatableRetention.kt")
        public void testJavaRepeatableRetention() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/javaRepeatableRetention.kt");
            doTest(fileName);
        }

        @TestMetadata("javaUnrepeatable.kt")
        public void testJavaUnrepeatable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/annotations/javaUnrepeatable.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJava8/duplicateJvmSignature")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DuplicateJvmSignature extends AbstractDiagnosticsWithFullJdkTest {
        public void testAllFilesPresentInDuplicateJvmSignature() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/duplicateJvmSignature"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJava8/duplicateJvmSignature/statics")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Statics extends AbstractDiagnosticsWithFullJdkTest {
            public void testAllFilesPresentInStatics() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/duplicateJvmSignature/statics"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("jjk.kt")
            public void testJjk() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/duplicateJvmSignature/statics/jjk.kt");
                doTest(fileName);
            }

            @TestMetadata("jk.kt")
            public void testJk() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/duplicateJvmSignature/statics/jk.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJava8/specialBuiltIns")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SpecialBuiltIns extends AbstractDiagnosticsWithFullJdkTest {
        public void testAllFilesPresentInSpecialBuiltIns() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/specialBuiltIns"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("hashtableInheritance.kt")
        public void testHashtableInheritance() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/specialBuiltIns/hashtableInheritance.kt");
            doTest(fileName);
        }

        @TestMetadata("securityProvider.kt")
        public void testSecurityProvider() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/specialBuiltIns/securityProvider.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJava8/statics")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Statics extends AbstractDiagnosticsWithFullJdkTest {
        public void testAllFilesPresentInStatics() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/statics"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("inheritanceStaticMethodFromInterface.kt")
        public void testInheritanceStaticMethodFromInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/statics/inheritanceStaticMethodFromInterface.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TargetedBuiltIns extends AbstractDiagnosticsWithFullJdkTest {
        public void testAllFilesPresentInTargetedBuiltIns() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("blackListed.kt")
        public void testBlackListed() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/blackListed.kt");
            doTest(fileName);
        }

        @TestMetadata("concurrentMapRemove.kt")
        public void testConcurrentMapRemove() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/concurrentMapRemove.kt");
            doTest(fileName);
        }

        @TestMetadata("forEachRemainingNullability.kt")
        public void testForEachRemainingNullability() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/forEachRemainingNullability.kt");
            doTest(fileName);
        }

        @TestMetadata("getOrDefault.kt")
        public void testGetOrDefault() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/getOrDefault.kt");
            doTest(fileName);
        }

        @TestMetadata("mutableMapRemove.kt")
        public void testMutableMapRemove() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/mutableMapRemove.kt");
            doTest(fileName);
        }

        @TestMetadata("removeIf.kt")
        public void testRemoveIf() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/removeIf.kt");
            doTest(fileName);
        }

        @TestMetadata("stream.kt")
        public void testStream() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/stream.kt");
            doTest(fileName);
        }

        @TestMetadata("unsupportedFeature.kt")
        public void testUnsupportedFeature() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/unsupportedFeature.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class BackwardCompatibility extends AbstractDiagnosticsWithFullJdkTest {
            public void testAllFilesPresentInBackwardCompatibility() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("basic.kt")
            public void testBasic() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility/basic.kt");
                doTest(fileName);
            }

            @TestMetadata("delegation.kt")
            public void testDelegation() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility/delegation.kt");
                doTest(fileName);
            }

            @TestMetadata("derivedInterfaces.kt")
            public void testDerivedInterfaces() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility/derivedInterfaces.kt");
                doTest(fileName);
            }

            @TestMetadata("derivedInterfacesWithKotlinFun.kt")
            public void testDerivedInterfacesWithKotlinFun() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility/derivedInterfacesWithKotlinFun.kt");
                doTest(fileName);
            }

            @TestMetadata("fillInStackTrace.kt")
            public void testFillInStackTrace() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility/fillInStackTrace.kt");
                doTest(fileName);
            }

            @TestMetadata("finalize.kt")
            public void testFinalize() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility/finalize.kt");
                doTest(fileName);
            }

            @TestMetadata("hashMapGetOrDefault.kt")
            public void testHashMapGetOrDefault() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/diagnostics/testsWithJava8/targetedBuiltIns/backwardCompatibility/hashMapGetOrDefault.kt");
                doTest(fileName);
            }
        }
    }
}
