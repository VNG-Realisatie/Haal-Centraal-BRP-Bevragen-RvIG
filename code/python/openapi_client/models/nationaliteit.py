# coding: utf-8

"""
    Bevragen Ingeschreven Personen

    API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.0.0/features) voor nadere toelichting.   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class Nationaliteit(object):
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
        'aanduiding_bijzonder_nederlanderschap': 'AanduidingBijzonderNederlanderschapEnum',
        'datum_ingang_geldigheid': 'DatumOnvolledig',
        'nationaliteit': 'Waardetabel',
        'reden_opname': 'Waardetabel',
        'in_onderzoek': 'NationaliteitInOnderzoek'
    }

    attribute_map = {
        'aanduiding_bijzonder_nederlanderschap': 'aanduidingBijzonderNederlanderschap',
        'datum_ingang_geldigheid': 'datumIngangGeldigheid',
        'nationaliteit': 'nationaliteit',
        'reden_opname': 'redenOpname',
        'in_onderzoek': 'inOnderzoek'
    }

    def __init__(self, aanduiding_bijzonder_nederlanderschap=None, datum_ingang_geldigheid=None, nationaliteit=None, reden_opname=None, in_onderzoek=None, local_vars_configuration=None):  # noqa: E501
        """Nationaliteit - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._aanduiding_bijzonder_nederlanderschap = None
        self._datum_ingang_geldigheid = None
        self._nationaliteit = None
        self._reden_opname = None
        self._in_onderzoek = None
        self.discriminator = None

        if aanduiding_bijzonder_nederlanderschap is not None:
            self.aanduiding_bijzonder_nederlanderschap = aanduiding_bijzonder_nederlanderschap
        if datum_ingang_geldigheid is not None:
            self.datum_ingang_geldigheid = datum_ingang_geldigheid
        if nationaliteit is not None:
            self.nationaliteit = nationaliteit
        if reden_opname is not None:
            self.reden_opname = reden_opname
        if in_onderzoek is not None:
            self.in_onderzoek = in_onderzoek

    @property
    def aanduiding_bijzonder_nederlanderschap(self):
        """Gets the aanduiding_bijzonder_nederlanderschap of this Nationaliteit.  # noqa: E501


        :return: The aanduiding_bijzonder_nederlanderschap of this Nationaliteit.  # noqa: E501
        :rtype: AanduidingBijzonderNederlanderschapEnum
        """
        return self._aanduiding_bijzonder_nederlanderschap

    @aanduiding_bijzonder_nederlanderschap.setter
    def aanduiding_bijzonder_nederlanderschap(self, aanduiding_bijzonder_nederlanderschap):
        """Sets the aanduiding_bijzonder_nederlanderschap of this Nationaliteit.


        :param aanduiding_bijzonder_nederlanderschap: The aanduiding_bijzonder_nederlanderschap of this Nationaliteit.  # noqa: E501
        :type: AanduidingBijzonderNederlanderschapEnum
        """

        self._aanduiding_bijzonder_nederlanderschap = aanduiding_bijzonder_nederlanderschap

    @property
    def datum_ingang_geldigheid(self):
        """Gets the datum_ingang_geldigheid of this Nationaliteit.  # noqa: E501


        :return: The datum_ingang_geldigheid of this Nationaliteit.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_ingang_geldigheid

    @datum_ingang_geldigheid.setter
    def datum_ingang_geldigheid(self, datum_ingang_geldigheid):
        """Sets the datum_ingang_geldigheid of this Nationaliteit.


        :param datum_ingang_geldigheid: The datum_ingang_geldigheid of this Nationaliteit.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_ingang_geldigheid = datum_ingang_geldigheid

    @property
    def nationaliteit(self):
        """Gets the nationaliteit of this Nationaliteit.  # noqa: E501


        :return: The nationaliteit of this Nationaliteit.  # noqa: E501
        :rtype: Waardetabel
        """
        return self._nationaliteit

    @nationaliteit.setter
    def nationaliteit(self, nationaliteit):
        """Sets the nationaliteit of this Nationaliteit.


        :param nationaliteit: The nationaliteit of this Nationaliteit.  # noqa: E501
        :type: Waardetabel
        """

        self._nationaliteit = nationaliteit

    @property
    def reden_opname(self):
        """Gets the reden_opname of this Nationaliteit.  # noqa: E501


        :return: The reden_opname of this Nationaliteit.  # noqa: E501
        :rtype: Waardetabel
        """
        return self._reden_opname

    @reden_opname.setter
    def reden_opname(self, reden_opname):
        """Sets the reden_opname of this Nationaliteit.


        :param reden_opname: The reden_opname of this Nationaliteit.  # noqa: E501
        :type: Waardetabel
        """

        self._reden_opname = reden_opname

    @property
    def in_onderzoek(self):
        """Gets the in_onderzoek of this Nationaliteit.  # noqa: E501


        :return: The in_onderzoek of this Nationaliteit.  # noqa: E501
        :rtype: NationaliteitInOnderzoek
        """
        return self._in_onderzoek

    @in_onderzoek.setter
    def in_onderzoek(self, in_onderzoek):
        """Sets the in_onderzoek of this Nationaliteit.


        :param in_onderzoek: The in_onderzoek of this Nationaliteit.  # noqa: E501
        :type: NationaliteitInOnderzoek
        """

        self._in_onderzoek = in_onderzoek

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
        if not isinstance(other, Nationaliteit):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Nationaliteit):
            return True

        return self.to_dict() != other.to_dict()
