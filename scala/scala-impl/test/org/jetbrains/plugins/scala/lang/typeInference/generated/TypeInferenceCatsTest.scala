package org.jetbrains.plugins.scala.lang.typeInference.generated

import org.jetbrains.plugins.scala.base.libraryLoaders.{CatsLoader, ThirdPartyLibraryLoader}
import org.jetbrains.plugins.scala.lang.typeInference.TypeInferenceTestBase

/**
  * @author Nikolay.Tropin
  */
class TypeInferenceCatsTest extends TypeInferenceTestBase {

  override protected def additionalLibraries(): Seq[ThirdPartyLibraryLoader] =
    Seq(CatsLoader())

  override protected def folderPath: String = super.folderPath + "cats/"

  def testSCL10006(): Unit = doTest()

  //  TODO: this test actually passes in debug IDEA, but fails in tests (ReferenceExpressionResolver.resolve() succeeds
  //   in debug idea with the same dependencies, while in tests it returns resolve failure)
  //  def testSCL10237() = doTest()

  def testSCL10237_1(): Unit = doTest()

  def testSCL10237_2(): Unit = doTest()
}
