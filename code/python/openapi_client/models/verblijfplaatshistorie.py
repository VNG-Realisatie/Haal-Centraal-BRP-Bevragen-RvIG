# coding: utf-8

"""
    Bevragingen ingeschreven personen

    API voor het ontsluiten van gegevens van ingeschreven personen en aanverwante gegevens uit de GBA en RNI. Met deze API worden de actuele gegevens van ingeschreven personen, hun kinderen, partners en ouders ontsloten. <br> Heeft een persoon bijvoorbeeld geen geldige nationaliteit, dan wordt nationaliteit niet geretourneerd. <br> Heeft een persoon een beëindigd partnerschap of huwelijk, dan wordt de partner niet geretourneerd. <br> <br> Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Bevragingen-ingeschreven-personen/tree/master/features) voor nadere toelichting. <br>   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class Verblijfplaatshistorie(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'functie_adres': 'SoortAdresEnum',
        'huisletter': 'str',
        'huisnummer': 'int',
        'huisnummertoevoeging': 'str',
        'aanduiding_bij_huisnummer': 'AanduidingBijHuisnummerEnum',
        'identificatiecode_nummeraanduiding': 'str',
        'naam_openbare_ruimte': 'str',
        'postcode': 'str',
        'woonplaatsnaam': 'str',
        'identificatiecode_adresseerbaar_object': 'str',
        'indicatie_vestiging_vanuit_buitenland': 'bool',
        'locatiebeschrijving': 'str',
        'straatnaam': 'str',
        'vanuit_vertrokken_onbekend_waarheen': 'bool',
        'datum_aanvang_adreshouding': 'DatumOnvolledig',
        'datum_ingang_geldigheid': 'DatumOnvolledig',
        'datum_inschrijving_in_gemeente': 'DatumOnvolledig',
        'datum_vestiging_in_nederland': 'DatumOnvolledig',
        'gemeente_van_inschrijving': 'Waardetabel',
        'land_vanwaar_ingeschreven': 'Waardetabel',
        'verblijf_buitenland': 'VerblijfBuitenland',
        'in_onderzoek': 'VerblijfplaatsInOnderzoek',
        'datum_tot': 'DatumOnvolledig',
        'geheimhouding_persoonsgegevens': 'bool'
    }

    attribute_map = {
        'functie_adres': 'functieAdres',
        'huisletter': 'huisletter',
        'huisnummer': 'huisnummer',
        'huisnummertoevoeging': 'huisnummertoevoeging',
        'aanduiding_bij_huisnummer': 'aanduidingBijHuisnummer',
        'identificatiecode_nummeraanduiding': 'identificatiecodeNummeraanduiding',
        'naam_openbare_ruimte': 'naamOpenbareRuimte',
        'postcode': 'postcode',
        'woonplaatsnaam': 'woonplaatsnaam',
        'identificatiecode_adresseerbaar_object': 'identificatiecodeAdresseerbaarObject',
        'indicatie_vestiging_vanuit_buitenland': 'indicatieVestigingVanuitBuitenland',
        'locatiebeschrijving': 'locatiebeschrijving',
        'straatnaam': 'straatnaam',
        'vanuit_vertrokken_onbekend_waarheen': 'vanuitVertrokkenOnbekendWaarheen',
        'datum_aanvang_adreshouding': 'datumAanvangAdreshouding',
        'datum_ingang_geldigheid': 'datumIngangGeldigheid',
        'datum_inschrijving_in_gemeente': 'datumInschrijvingInGemeente',
        'datum_vestiging_in_nederland': 'datumVestigingInNederland',
        'gemeente_van_inschrijving': 'gemeenteVanInschrijving',
        'land_vanwaar_ingeschreven': 'landVanwaarIngeschreven',
        'verblijf_buitenland': 'verblijfBuitenland',
        'in_onderzoek': 'inOnderzoek',
        'datum_tot': 'datumTot',
        'geheimhouding_persoonsgegevens': 'geheimhoudingPersoonsgegevens'
    }

    def __init__(self, functie_adres=None, huisletter=None, huisnummer=None, huisnummertoevoeging=None, aanduiding_bij_huisnummer=None, identificatiecode_nummeraanduiding=None, naam_openbare_ruimte=None, postcode=None, woonplaatsnaam=None, identificatiecode_adresseerbaar_object=None, indicatie_vestiging_vanuit_buitenland=None, locatiebeschrijving=None, straatnaam=None, vanuit_vertrokken_onbekend_waarheen=None, datum_aanvang_adreshouding=None, datum_ingang_geldigheid=None, datum_inschrijving_in_gemeente=None, datum_vestiging_in_nederland=None, gemeente_van_inschrijving=None, land_vanwaar_ingeschreven=None, verblijf_buitenland=None, in_onderzoek=None, datum_tot=None, geheimhouding_persoonsgegevens=None, local_vars_configuration=None):  # noqa: E501
        """Verblijfplaatshistorie - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._functie_adres = None
        self._huisletter = None
        self._huisnummer = None
        self._huisnummertoevoeging = None
        self._aanduiding_bij_huisnummer = None
        self._identificatiecode_nummeraanduiding = None
        self._naam_openbare_ruimte = None
        self._postcode = None
        self._woonplaatsnaam = None
        self._identificatiecode_adresseerbaar_object = None
        self._indicatie_vestiging_vanuit_buitenland = None
        self._locatiebeschrijving = None
        self._straatnaam = None
        self._vanuit_vertrokken_onbekend_waarheen = None
        self._datum_aanvang_adreshouding = None
        self._datum_ingang_geldigheid = None
        self._datum_inschrijving_in_gemeente = None
        self._datum_vestiging_in_nederland = None
        self._gemeente_van_inschrijving = None
        self._land_vanwaar_ingeschreven = None
        self._verblijf_buitenland = None
        self._in_onderzoek = None
        self._datum_tot = None
        self._geheimhouding_persoonsgegevens = None
        self.discriminator = None

        if functie_adres is not None:
            self.functie_adres = functie_adres
        if huisletter is not None:
            self.huisletter = huisletter
        if huisnummer is not None:
            self.huisnummer = huisnummer
        if huisnummertoevoeging is not None:
            self.huisnummertoevoeging = huisnummertoevoeging
        if aanduiding_bij_huisnummer is not None:
            self.aanduiding_bij_huisnummer = aanduiding_bij_huisnummer
        if identificatiecode_nummeraanduiding is not None:
            self.identificatiecode_nummeraanduiding = identificatiecode_nummeraanduiding
        if naam_openbare_ruimte is not None:
            self.naam_openbare_ruimte = naam_openbare_ruimte
        if postcode is not None:
            self.postcode = postcode
        if woonplaatsnaam is not None:
            self.woonplaatsnaam = woonplaatsnaam
        if identificatiecode_adresseerbaar_object is not None:
            self.identificatiecode_adresseerbaar_object = identificatiecode_adresseerbaar_object
        if indicatie_vestiging_vanuit_buitenland is not None:
            self.indicatie_vestiging_vanuit_buitenland = indicatie_vestiging_vanuit_buitenland
        if locatiebeschrijving is not None:
            self.locatiebeschrijving = locatiebeschrijving
        if straatnaam is not None:
            self.straatnaam = straatnaam
        if vanuit_vertrokken_onbekend_waarheen is not None:
            self.vanuit_vertrokken_onbekend_waarheen = vanuit_vertrokken_onbekend_waarheen
        if datum_aanvang_adreshouding is not None:
            self.datum_aanvang_adreshouding = datum_aanvang_adreshouding
        if datum_ingang_geldigheid is not None:
            self.datum_ingang_geldigheid = datum_ingang_geldigheid
        if datum_inschrijving_in_gemeente is not None:
            self.datum_inschrijving_in_gemeente = datum_inschrijving_in_gemeente
        if datum_vestiging_in_nederland is not None:
            self.datum_vestiging_in_nederland = datum_vestiging_in_nederland
        if gemeente_van_inschrijving is not None:
            self.gemeente_van_inschrijving = gemeente_van_inschrijving
        if land_vanwaar_ingeschreven is not None:
            self.land_vanwaar_ingeschreven = land_vanwaar_ingeschreven
        if verblijf_buitenland is not None:
            self.verblijf_buitenland = verblijf_buitenland
        if in_onderzoek is not None:
            self.in_onderzoek = in_onderzoek
        if datum_tot is not None:
            self.datum_tot = datum_tot
        if geheimhouding_persoonsgegevens is not None:
            self.geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens

    @property
    def functie_adres(self):
        """Gets the functie_adres of this Verblijfplaatshistorie.  # noqa: E501


        :return: The functie_adres of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: SoortAdresEnum
        """
        return self._functie_adres

    @functie_adres.setter
    def functie_adres(self, functie_adres):
        """Sets the functie_adres of this Verblijfplaatshistorie.


        :param functie_adres: The functie_adres of this Verblijfplaatshistorie.  # noqa: E501
        :type: SoortAdresEnum
        """

        self._functie_adres = functie_adres

    @property
    def huisletter(self):
        """Gets the huisletter of this Verblijfplaatshistorie.  # noqa: E501

        Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende toevoeging aan een huisnummer in de vorm van een alfanumeriek teken. a - z , A – Z  # noqa: E501

        :return: The huisletter of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._huisletter

    @huisletter.setter
    def huisletter(self, huisletter):
        """Sets the huisletter of this Verblijfplaatshistorie.

        Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende toevoeging aan een huisnummer in de vorm van een alfanumeriek teken. a - z , A – Z  # noqa: E501

        :param huisletter: The huisletter of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                huisletter is not None and len(huisletter) > 1):
            raise ValueError("Invalid value for `huisletter`, length must be less than or equal to `1`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                huisletter is not None and not re.search(r'^[A-Z,a-z]$', huisletter)):  # noqa: E501
            raise ValueError(r"Invalid value for `huisletter`, must be a follow pattern or equal to `/^[A-Z,a-z]$/`")  # noqa: E501

        self._huisletter = huisletter

    @property
    def huisnummer(self):
        """Gets the huisnummer of this Verblijfplaatshistorie.  # noqa: E501

        Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nummering. Alle natuurlijke getallen tussen 1 en 99999.  # noqa: E501

        :return: The huisnummer of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: int
        """
        return self._huisnummer

    @huisnummer.setter
    def huisnummer(self, huisnummer):
        """Sets the huisnummer of this Verblijfplaatshistorie.

        Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nummering. Alle natuurlijke getallen tussen 1 en 99999.  # noqa: E501

        :param huisnummer: The huisnummer of this Verblijfplaatshistorie.  # noqa: E501
        :type: int
        """
        if (self.local_vars_configuration.client_side_validation and
                huisnummer is not None and huisnummer > 99999):  # noqa: E501
            raise ValueError("Invalid value for `huisnummer`, must be a value less than or equal to `99999`")  # noqa: E501

        self._huisnummer = huisnummer

    @property
    def huisnummertoevoeging(self):
        """Gets the huisnummertoevoeging of this Verblijfplaatshistorie.  # noqa: E501

        Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nadere toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter. a - z , A - Z , 0 – 9  # noqa: E501

        :return: The huisnummertoevoeging of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._huisnummertoevoeging

    @huisnummertoevoeging.setter
    def huisnummertoevoeging(self, huisnummertoevoeging):
        """Sets the huisnummertoevoeging of this Verblijfplaatshistorie.

        Een door of namens het bevoegd gemeentelijk orgaan ten aanzien van een adresseerbaar object toegekende nadere toevoeging aan een huisnummer of een combinatie van huisnummer en huisletter. a - z , A - Z , 0 – 9  # noqa: E501

        :param huisnummertoevoeging: The huisnummertoevoeging of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                huisnummertoevoeging is not None and len(huisnummertoevoeging) > 4):
            raise ValueError("Invalid value for `huisnummertoevoeging`, length must be less than or equal to `4`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                huisnummertoevoeging is not None and not re.search(r'^[a-zA-Z0-9]{1,4}$', huisnummertoevoeging)):  # noqa: E501
            raise ValueError(r"Invalid value for `huisnummertoevoeging`, must be a follow pattern or equal to `/^[a-zA-Z0-9]{1,4}$/`")  # noqa: E501

        self._huisnummertoevoeging = huisnummertoevoeging

    @property
    def aanduiding_bij_huisnummer(self):
        """Gets the aanduiding_bij_huisnummer of this Verblijfplaatshistorie.  # noqa: E501


        :return: The aanduiding_bij_huisnummer of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: AanduidingBijHuisnummerEnum
        """
        return self._aanduiding_bij_huisnummer

    @aanduiding_bij_huisnummer.setter
    def aanduiding_bij_huisnummer(self, aanduiding_bij_huisnummer):
        """Sets the aanduiding_bij_huisnummer of this Verblijfplaatshistorie.


        :param aanduiding_bij_huisnummer: The aanduiding_bij_huisnummer of this Verblijfplaatshistorie.  # noqa: E501
        :type: AanduidingBijHuisnummerEnum
        """

        self._aanduiding_bij_huisnummer = aanduiding_bij_huisnummer

    @property
    def identificatiecode_nummeraanduiding(self):
        """Gets the identificatiecode_nummeraanduiding of this Verblijfplaatshistorie.  # noqa: E501

        De unieke aanduiding van een NUMMERAANDUIDING. Combinatie van de viercijferige 'gemeentecode' de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding. Combinatie van de viercijferige 'gemeentecode' (volgens GBA tabel 33, Gemeententabel), de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding.  # noqa: E501

        :return: The identificatiecode_nummeraanduiding of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._identificatiecode_nummeraanduiding

    @identificatiecode_nummeraanduiding.setter
    def identificatiecode_nummeraanduiding(self, identificatiecode_nummeraanduiding):
        """Sets the identificatiecode_nummeraanduiding of this Verblijfplaatshistorie.

        De unieke aanduiding van een NUMMERAANDUIDING. Combinatie van de viercijferige 'gemeentecode' de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding. Combinatie van de viercijferige 'gemeentecode' (volgens GBA tabel 33, Gemeententabel), de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'. De objecttypecode kent in de BAG de volgende waarde:20 nummeraanduiding.  # noqa: E501

        :param identificatiecode_nummeraanduiding: The identificatiecode_nummeraanduiding of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                identificatiecode_nummeraanduiding is not None and len(identificatiecode_nummeraanduiding) > 16):
            raise ValueError("Invalid value for `identificatiecode_nummeraanduiding`, length must be less than or equal to `16`")  # noqa: E501

        self._identificatiecode_nummeraanduiding = identificatiecode_nummeraanduiding

    @property
    def naam_openbare_ruimte(self):
        """Gets the naam_openbare_ruimte of this Verblijfplaatshistorie.  # noqa: E501

        Een door het bevoegde gemeentelijke orgaan aan een OPENBARE RUIMTE toegekende benaming Tekens gecodeerd volgens de UTF-8 standaard  # noqa: E501

        :return: The naam_openbare_ruimte of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._naam_openbare_ruimte

    @naam_openbare_ruimte.setter
    def naam_openbare_ruimte(self, naam_openbare_ruimte):
        """Sets the naam_openbare_ruimte of this Verblijfplaatshistorie.

        Een door het bevoegde gemeentelijke orgaan aan een OPENBARE RUIMTE toegekende benaming Tekens gecodeerd volgens de UTF-8 standaard  # noqa: E501

        :param naam_openbare_ruimte: The naam_openbare_ruimte of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                naam_openbare_ruimte is not None and len(naam_openbare_ruimte) > 80):
            raise ValueError("Invalid value for `naam_openbare_ruimte`, length must be less than or equal to `80`")  # noqa: E501

        self._naam_openbare_ruimte = naam_openbare_ruimte

    @property
    def postcode(self):
        """Gets the postcode of this Verblijfplaatshistorie.  # noqa: E501

        De door PostNL vastgestelde code behorende bij een bepaalde combinatie van een naam van een woonplaats, naam van een openbare ruimte en een huisnummer  # noqa: E501

        :return: The postcode of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._postcode

    @postcode.setter
    def postcode(self, postcode):
        """Sets the postcode of this Verblijfplaatshistorie.

        De door PostNL vastgestelde code behorende bij een bepaalde combinatie van een naam van een woonplaats, naam van een openbare ruimte en een huisnummer  # noqa: E501

        :param postcode: The postcode of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                postcode is not None and not re.search(r'^[1-9]{1}[0-9]{3}[A-Z]{2}$', postcode)):  # noqa: E501
            raise ValueError(r"Invalid value for `postcode`, must be a follow pattern or equal to `/^[1-9]{1}[0-9]{3}[A-Z]{2}$/`")  # noqa: E501

        self._postcode = postcode

    @property
    def woonplaatsnaam(self):
        """Gets the woonplaatsnaam of this Verblijfplaatshistorie.  # noqa: E501

        De door het bevoegde gemeentelijke orgaan aan een WOONPLAATS toegekende benaming. Tekens gecodeerd volgens de UTF-8 standaard.  # noqa: E501

        :return: The woonplaatsnaam of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._woonplaatsnaam

    @woonplaatsnaam.setter
    def woonplaatsnaam(self, woonplaatsnaam):
        """Sets the woonplaatsnaam of this Verblijfplaatshistorie.

        De door het bevoegde gemeentelijke orgaan aan een WOONPLAATS toegekende benaming. Tekens gecodeerd volgens de UTF-8 standaard.  # noqa: E501

        :param woonplaatsnaam: The woonplaatsnaam of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                woonplaatsnaam is not None and len(woonplaatsnaam) > 80):
            raise ValueError("Invalid value for `woonplaatsnaam`, length must be less than or equal to `80`")  # noqa: E501

        self._woonplaatsnaam = woonplaatsnaam

    @property
    def identificatiecode_adresseerbaar_object(self):
        """Gets the identificatiecode_adresseerbaar_object of this Verblijfplaatshistorie.  # noqa: E501

        Een verblijfplaats kan een ligplaats, een standplaats of een verblijfsobject in een of meerdere panden zijn, waaraan respectievelijk een ligplaatsidentificatie, standplaatsidentificatie of verblijfsobjectidentificatie is toegekend. De Identificatiecode verblijfplaats is een combinatie van een viercijferige gemeentecode, een tweecijferige objecttypecode die aangeeft of de aanduiding een verblijfsobject (01), ligplaats (02) of standplaats (03) betreft en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig volgnummer. Combinatie van de viercijferige 'gemeentecode' (volgens GBA tabel 33, Gemeententabel), de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'.  # noqa: E501

        :return: The identificatiecode_adresseerbaar_object of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._identificatiecode_adresseerbaar_object

    @identificatiecode_adresseerbaar_object.setter
    def identificatiecode_adresseerbaar_object(self, identificatiecode_adresseerbaar_object):
        """Sets the identificatiecode_adresseerbaar_object of this Verblijfplaatshistorie.

        Een verblijfplaats kan een ligplaats, een standplaats of een verblijfsobject in een of meerdere panden zijn, waaraan respectievelijk een ligplaatsidentificatie, standplaatsidentificatie of verblijfsobjectidentificatie is toegekend. De Identificatiecode verblijfplaats is een combinatie van een viercijferige gemeentecode, een tweecijferige objecttypecode die aangeeft of de aanduiding een verblijfsobject (01), ligplaats (02) of standplaats (03) betreft en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig volgnummer. Combinatie van de viercijferige 'gemeentecode' (volgens GBA tabel 33, Gemeententabel), de tweecijferige 'objecttypecode' en een voor het betreffende objecttype binnen een gemeente uniek tiencijferig 'objectvolgnummer'.  # noqa: E501

        :param identificatiecode_adresseerbaar_object: The identificatiecode_adresseerbaar_object of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                identificatiecode_adresseerbaar_object is not None and len(identificatiecode_adresseerbaar_object) > 16):
            raise ValueError("Invalid value for `identificatiecode_adresseerbaar_object`, length must be less than or equal to `16`")  # noqa: E501

        self._identificatiecode_adresseerbaar_object = identificatiecode_adresseerbaar_object

    @property
    def indicatie_vestiging_vanuit_buitenland(self):
        """Gets the indicatie_vestiging_vanuit_buitenland of this Verblijfplaatshistorie.  # noqa: E501

        Indicatie waarmee aangegeven wordt of de ingeschreven persoon zich vanuit het buitenland heeftingeschreven. Deze indicatie heeft als rol om aan te geven dat iemand zich vanuit het buitenland gevestigd heeft. Deze indicator wordt altijd meegeleverd als de waarde true is. Als de waarde false is wordt de indicator niet meegeleverd.  # noqa: E501

        :return: The indicatie_vestiging_vanuit_buitenland of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: bool
        """
        return self._indicatie_vestiging_vanuit_buitenland

    @indicatie_vestiging_vanuit_buitenland.setter
    def indicatie_vestiging_vanuit_buitenland(self, indicatie_vestiging_vanuit_buitenland):
        """Sets the indicatie_vestiging_vanuit_buitenland of this Verblijfplaatshistorie.

        Indicatie waarmee aangegeven wordt of de ingeschreven persoon zich vanuit het buitenland heeftingeschreven. Deze indicatie heeft als rol om aan te geven dat iemand zich vanuit het buitenland gevestigd heeft. Deze indicator wordt altijd meegeleverd als de waarde true is. Als de waarde false is wordt de indicator niet meegeleverd.  # noqa: E501

        :param indicatie_vestiging_vanuit_buitenland: The indicatie_vestiging_vanuit_buitenland of this Verblijfplaatshistorie.  # noqa: E501
        :type: bool
        """

        self._indicatie_vestiging_vanuit_buitenland = indicatie_vestiging_vanuit_buitenland

    @property
    def locatiebeschrijving(self):
        """Gets the locatiebeschrijving of this Verblijfplaatshistorie.  # noqa: E501

        Een geheel of gedeeltelijke omschrijving van de ligging van een object.  # noqa: E501

        :return: The locatiebeschrijving of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._locatiebeschrijving

    @locatiebeschrijving.setter
    def locatiebeschrijving(self, locatiebeschrijving):
        """Sets the locatiebeschrijving of this Verblijfplaatshistorie.

        Een geheel of gedeeltelijke omschrijving van de ligging van een object.  # noqa: E501

        :param locatiebeschrijving: The locatiebeschrijving of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                locatiebeschrijving is not None and len(locatiebeschrijving) > 35):
            raise ValueError("Invalid value for `locatiebeschrijving`, length must be less than or equal to `35`")  # noqa: E501

        self._locatiebeschrijving = locatiebeschrijving

    @property
    def straatnaam(self):
        """Gets the straatnaam of this Verblijfplaatshistorie.  # noqa: E501

        De officiële straatnaam zoals door het bevoegd gemeentelijk orgaan is vastgesteld, zo nodig ingekort conform de specificaties van de NEN 5825. alle alfanumrieke tekens  # noqa: E501

        :return: The straatnaam of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: str
        """
        return self._straatnaam

    @straatnaam.setter
    def straatnaam(self, straatnaam):
        """Sets the straatnaam of this Verblijfplaatshistorie.

        De officiële straatnaam zoals door het bevoegd gemeentelijk orgaan is vastgesteld, zo nodig ingekort conform de specificaties van de NEN 5825. alle alfanumrieke tekens  # noqa: E501

        :param straatnaam: The straatnaam of this Verblijfplaatshistorie.  # noqa: E501
        :type: str
        """
        if (self.local_vars_configuration.client_side_validation and
                straatnaam is not None and len(straatnaam) > 24):
            raise ValueError("Invalid value for `straatnaam`, length must be less than or equal to `24`")  # noqa: E501

        self._straatnaam = straatnaam

    @property
    def vanuit_vertrokken_onbekend_waarheen(self):
        """Gets the vanuit_vertrokken_onbekend_waarheen of this Verblijfplaatshistorie.  # noqa: E501

        Indicatie waarmee aangegeven wordt dat de persoon is teruggekeerd uit een situatie van vertrokken onbekend waarheen  # noqa: E501

        :return: The vanuit_vertrokken_onbekend_waarheen of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: bool
        """
        return self._vanuit_vertrokken_onbekend_waarheen

    @vanuit_vertrokken_onbekend_waarheen.setter
    def vanuit_vertrokken_onbekend_waarheen(self, vanuit_vertrokken_onbekend_waarheen):
        """Sets the vanuit_vertrokken_onbekend_waarheen of this Verblijfplaatshistorie.

        Indicatie waarmee aangegeven wordt dat de persoon is teruggekeerd uit een situatie van vertrokken onbekend waarheen  # noqa: E501

        :param vanuit_vertrokken_onbekend_waarheen: The vanuit_vertrokken_onbekend_waarheen of this Verblijfplaatshistorie.  # noqa: E501
        :type: bool
        """

        self._vanuit_vertrokken_onbekend_waarheen = vanuit_vertrokken_onbekend_waarheen

    @property
    def datum_aanvang_adreshouding(self):
        """Gets the datum_aanvang_adreshouding of this Verblijfplaatshistorie.  # noqa: E501


        :return: The datum_aanvang_adreshouding of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_aanvang_adreshouding

    @datum_aanvang_adreshouding.setter
    def datum_aanvang_adreshouding(self, datum_aanvang_adreshouding):
        """Sets the datum_aanvang_adreshouding of this Verblijfplaatshistorie.


        :param datum_aanvang_adreshouding: The datum_aanvang_adreshouding of this Verblijfplaatshistorie.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_aanvang_adreshouding = datum_aanvang_adreshouding

    @property
    def datum_ingang_geldigheid(self):
        """Gets the datum_ingang_geldigheid of this Verblijfplaatshistorie.  # noqa: E501


        :return: The datum_ingang_geldigheid of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_ingang_geldigheid

    @datum_ingang_geldigheid.setter
    def datum_ingang_geldigheid(self, datum_ingang_geldigheid):
        """Sets the datum_ingang_geldigheid of this Verblijfplaatshistorie.


        :param datum_ingang_geldigheid: The datum_ingang_geldigheid of this Verblijfplaatshistorie.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_ingang_geldigheid = datum_ingang_geldigheid

    @property
    def datum_inschrijving_in_gemeente(self):
        """Gets the datum_inschrijving_in_gemeente of this Verblijfplaatshistorie.  # noqa: E501


        :return: The datum_inschrijving_in_gemeente of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_inschrijving_in_gemeente

    @datum_inschrijving_in_gemeente.setter
    def datum_inschrijving_in_gemeente(self, datum_inschrijving_in_gemeente):
        """Sets the datum_inschrijving_in_gemeente of this Verblijfplaatshistorie.


        :param datum_inschrijving_in_gemeente: The datum_inschrijving_in_gemeente of this Verblijfplaatshistorie.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_inschrijving_in_gemeente = datum_inschrijving_in_gemeente

    @property
    def datum_vestiging_in_nederland(self):
        """Gets the datum_vestiging_in_nederland of this Verblijfplaatshistorie.  # noqa: E501


        :return: The datum_vestiging_in_nederland of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_vestiging_in_nederland

    @datum_vestiging_in_nederland.setter
    def datum_vestiging_in_nederland(self, datum_vestiging_in_nederland):
        """Sets the datum_vestiging_in_nederland of this Verblijfplaatshistorie.


        :param datum_vestiging_in_nederland: The datum_vestiging_in_nederland of this Verblijfplaatshistorie.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_vestiging_in_nederland = datum_vestiging_in_nederland

    @property
    def gemeente_van_inschrijving(self):
        """Gets the gemeente_van_inschrijving of this Verblijfplaatshistorie.  # noqa: E501


        :return: The gemeente_van_inschrijving of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: Waardetabel
        """
        return self._gemeente_van_inschrijving

    @gemeente_van_inschrijving.setter
    def gemeente_van_inschrijving(self, gemeente_van_inschrijving):
        """Sets the gemeente_van_inschrijving of this Verblijfplaatshistorie.


        :param gemeente_van_inschrijving: The gemeente_van_inschrijving of this Verblijfplaatshistorie.  # noqa: E501
        :type: Waardetabel
        """

        self._gemeente_van_inschrijving = gemeente_van_inschrijving

    @property
    def land_vanwaar_ingeschreven(self):
        """Gets the land_vanwaar_ingeschreven of this Verblijfplaatshistorie.  # noqa: E501


        :return: The land_vanwaar_ingeschreven of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: Waardetabel
        """
        return self._land_vanwaar_ingeschreven

    @land_vanwaar_ingeschreven.setter
    def land_vanwaar_ingeschreven(self, land_vanwaar_ingeschreven):
        """Sets the land_vanwaar_ingeschreven of this Verblijfplaatshistorie.


        :param land_vanwaar_ingeschreven: The land_vanwaar_ingeschreven of this Verblijfplaatshistorie.  # noqa: E501
        :type: Waardetabel
        """

        self._land_vanwaar_ingeschreven = land_vanwaar_ingeschreven

    @property
    def verblijf_buitenland(self):
        """Gets the verblijf_buitenland of this Verblijfplaatshistorie.  # noqa: E501


        :return: The verblijf_buitenland of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: VerblijfBuitenland
        """
        return self._verblijf_buitenland

    @verblijf_buitenland.setter
    def verblijf_buitenland(self, verblijf_buitenland):
        """Sets the verblijf_buitenland of this Verblijfplaatshistorie.


        :param verblijf_buitenland: The verblijf_buitenland of this Verblijfplaatshistorie.  # noqa: E501
        :type: VerblijfBuitenland
        """

        self._verblijf_buitenland = verblijf_buitenland

    @property
    def in_onderzoek(self):
        """Gets the in_onderzoek of this Verblijfplaatshistorie.  # noqa: E501


        :return: The in_onderzoek of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: VerblijfplaatsInOnderzoek
        """
        return self._in_onderzoek

    @in_onderzoek.setter
    def in_onderzoek(self, in_onderzoek):
        """Sets the in_onderzoek of this Verblijfplaatshistorie.


        :param in_onderzoek: The in_onderzoek of this Verblijfplaatshistorie.  # noqa: E501
        :type: VerblijfplaatsInOnderzoek
        """

        self._in_onderzoek = in_onderzoek

    @property
    def datum_tot(self):
        """Gets the datum_tot of this Verblijfplaatshistorie.  # noqa: E501


        :return: The datum_tot of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_tot

    @datum_tot.setter
    def datum_tot(self, datum_tot):
        """Sets the datum_tot of this Verblijfplaatshistorie.


        :param datum_tot: The datum_tot of this Verblijfplaatshistorie.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_tot = datum_tot

    @property
    def geheimhouding_persoonsgegevens(self):
        """Gets the geheimhouding_persoonsgegevens of this Verblijfplaatshistorie.  # noqa: E501

        Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.  # noqa: E501

        :return: The geheimhouding_persoonsgegevens of this Verblijfplaatshistorie.  # noqa: E501
        :rtype: bool
        """
        return self._geheimhouding_persoonsgegevens

    @geheimhouding_persoonsgegevens.setter
    def geheimhouding_persoonsgegevens(self, geheimhouding_persoonsgegevens):
        """Sets the geheimhouding_persoonsgegevens of this Verblijfplaatshistorie.

        Een aanduiding die aangeeft dat gegevens wel of niet verstrekt mogen worden. Indien true: op verzoek van deze persoon is het verstrekken van gegevens over deze persoon aan bepaalde derden niet toegestaan.  # noqa: E501

        :param geheimhouding_persoonsgegevens: The geheimhouding_persoonsgegevens of this Verblijfplaatshistorie.  # noqa: E501
        :type: bool
        """

        self._geheimhouding_persoonsgegevens = geheimhouding_persoonsgegevens

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Verblijfplaatshistorie):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Verblijfplaatshistorie):
            return True

        return self.to_dict() != other.to_dict()
