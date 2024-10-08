@file:JvmName("_FinderRawMethods")
@file:JvmMultifileClass
package pro.truongsinh.appium_flutter.finder

import java.util.regex.Pattern;

fun bySemanticsLabel(label: String): FlutterElement {
  return FlutterElement(mapOf(
    "finderType" to "BySemanticsLabel",
    "label" to label
    ))
}

fun bySemanticsLabel(label: Pattern): FlutterElement {
  return FlutterElement(mapOf(
    "finderType" to "BySemanticsLabel",
    "label" to label.toString()
    ))
}
