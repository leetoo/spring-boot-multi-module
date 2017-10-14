package io.manco.maxim.sbmm.service.stub;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import io.manco.maxim.sbmm.domain.Bar;
import io.manco.maxim.sbmm.repository.BarRepository;

public class BarRepositoryStub implements BarRepository {
	
	public static Map<Integer, Map<String, List<Bar>>> marketDataDbSimulator;
	private static final int WATCHLIST_ID = 1;

	@Override
	public List<Bar> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bar> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bar> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bar> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Bar> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Bar> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public Bar getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bar> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bar> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Bar> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Bar arg0) {
		marketDataDbSimulator.get(WATCHLIST_ID).get(arg0.getStock().getId()).stream()
    .filter(p -> p.getMdId().equals(arg0.getMdId()));

	}

	@Override
	public void delete(Iterable<? extends Bar> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Bar findOne(Integer arg0) {
		return null;
	}

	@Override
	public <S extends Bar> S save(S arg0) {
		marketDataDbSimulator.get(WATCHLIST_ID).get(arg0.getStock().getName().toString()).add(arg0);
		return arg0;
	}

	@Override
	public <S extends Bar> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Bar> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Bar> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Bar> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bar> findByStockId(Integer stockId) {
		return marketDataDbSimulator.get(WATCHLIST_ID).get(stockId);
	}

	@Override
	public Bar findByMdIdAndStockId(Integer mdId, Integer stockId) {
		return marketDataDbSimulator.get(WATCHLIST_ID).get(stockId)
    .stream().filter(p -> (p.getMdId().equals(mdId))).findFirst().get();
	}

}
