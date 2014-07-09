
object Main {
	def main(args: Array[String]) : Unit = {
		val resource: String = "SqlMapConfig.xml"
		val reader: AccountReader = new AccountReader(resource)
		reader.read("minglin")
	}
}
