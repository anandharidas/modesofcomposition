package modesofcomposition

/** Sku (Shelf Keeping Unit) is a valid code identifying one purchasable product in the store
 *
 * nonAvailableRegions indicate if Skus are not available to purchase by customers in some regions
 * */
case class Sku private (code: String, nonAvailableRegions: Set[CustomerRegion] = Set.empty)

/** Validates a sku code string is a valid Sku */
trait SkuLookup[F[_]] {

  def resolveSku(s: String): F[Either[String, Sku]]
}
