package org.un.core.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.un.core.capsule.BytesCapsule;
import org.un.core.db.UnDatabase;

@Component
public class CommonStore extends UnDatabase<BytesCapsule> {

  @Autowired
  public CommonStore(ApplicationContext ctx) {
    super("common");
  }

  @Override
  public void put(byte[] key, BytesCapsule item) {
    dbSource.putData(key, item.getData());
  }

  @Override
  public void delete(byte[] key) {
    dbSource.deleteData(key);
  }

  @Override
  public BytesCapsule get(byte[] key) {
    return new BytesCapsule(dbSource.getData(key));
  }

  @Override
  public boolean has(byte[] key) {
    return dbSource.getData(key) != null;
  }
}
