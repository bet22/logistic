package ru.bet.logistic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bet.logistic.domain.Mark;

public interface MarkRepo extends JpaRepository<Mark, Long> {
}
