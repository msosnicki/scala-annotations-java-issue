package scalac.issues

trait Foo[F[_]] {
  def print[A](l: F[A]): Unit
}

object Foo {
  def print[F[_], A](f: F[A]) = new Foo[F] {
    override def print[A](l: F[A]) = println(l)
  }.print(f)
}
