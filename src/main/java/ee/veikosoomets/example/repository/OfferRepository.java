package ee.veikosoomets.example.repository;


import ee.veikosoomets.example.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
