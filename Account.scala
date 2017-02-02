
trait Account

case class CheckingAccount extends Account
case class SavingAccount extends Account
case class MoneyMarketAccount extends Account

object Account {
  def apply() = {
    // instantiate Checking, Savings or MoneyMarket Account
    // depending on parameters
  }
}
