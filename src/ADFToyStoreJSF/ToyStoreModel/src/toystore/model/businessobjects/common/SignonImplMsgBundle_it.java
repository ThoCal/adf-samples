/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
// $Header: /cvs/ADFToyStoreJSF/ToyStoreModel/src/toystore/model/businessobjects/common/SignonImplMsgBundle_it.java,v 1.1.1.1 2006/01/26 21:47:21 steve Exp $
package toystore.model.businessobjects.common;
import oracle.jbo.common.JboResourceBundle;
import toystore.fwk.exceptions.ErrorMessages;
/**
 * Italian translations of Signon entity object control hints
 * Traduzioni italiane dei control hint dell'entity object Signon
 */
public class SignonImplMsgBundle_it extends SignonImplMsgBundle {
  static final Object[][] sMessageStrings = {
    {
      ErrorMessages.ENTITY_ALREADY_EXISTS,
      "Un altro utente ha gi� scelto questo nome. Prova un altro."
    },
    { "Username_LABEL", "User ID" },
    {
      "Username_TOOLTIP",
      "Inserisci un username per identificarti in questo sito."
    },
    { "Password_LABEL", "Password" },
    { "Password_TOOLTIP", "Inserisci una password" },
  };

  public SignonImplMsgBundle_it() {
  }

  public Object[][] getContents() {
    return super.getMergedArray(sMessageStrings, super.getContents());
  }
}
