"""
    Bevragen Ingeschreven Personen RvIG

    API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.2.0/features) voor nadere toelichting.  De API zal door RvIG worden aangeboden. Daarin wordt een aantal afgeleide gegevens niet opgenomen. Daarom bevat deze specificatie minder gegevens dan de specificatie op [BRP-bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/blob/master/specificatie/genereervariant/openapi.yaml).   # noqa: E501

    The version of the OpenAPI document: 1.2.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
)

def lazy_import():
    from openapi_client.model.datum_onvolledig import DatumOnvolledig
    from openapi_client.model.geboorte import Geboorte
    from openapi_client.model.geslacht_enum import GeslachtEnum
    from openapi_client.model.naam import Naam
    from openapi_client.model.ouder import Ouder
    from openapi_client.model.ouder_aanduiding_enum import OuderAanduidingEnum
    from openapi_client.model.ouder_hal_basis_all_of import OuderHalBasisAllOf
    from openapi_client.model.ouder_in_onderzoek import OuderInOnderzoek
    from openapi_client.model.ouder_links import OuderLinks
    globals()['DatumOnvolledig'] = DatumOnvolledig
    globals()['Geboorte'] = Geboorte
    globals()['GeslachtEnum'] = GeslachtEnum
    globals()['Naam'] = Naam
    globals()['Ouder'] = Ouder
    globals()['OuderAanduidingEnum'] = OuderAanduidingEnum
    globals()['OuderHalBasisAllOf'] = OuderHalBasisAllOf
    globals()['OuderInOnderzoek'] = OuderInOnderzoek
    globals()['OuderLinks'] = OuderLinks


class OuderHalBasis(ModelComposed):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'burgerservicenummer': (str,),  # noqa: E501
            'geslachtsaanduiding': (GeslachtEnum,),  # noqa: E501
            'ouder_aanduiding': (OuderAanduidingEnum,),  # noqa: E501
            'datum_ingang_familierechtelijke_betrekking': (DatumOnvolledig,),  # noqa: E501
            'naam': (Naam,),  # noqa: E501
            'in_onderzoek': (OuderInOnderzoek,),  # noqa: E501
            'geboorte': (Geboorte,),  # noqa: E501
            'geheimhouding_persoonsgegevens': (bool,),  # noqa: E501
            'links': (OuderLinks,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'burgerservicenummer': 'burgerservicenummer',  # noqa: E501
        'geslachtsaanduiding': 'geslachtsaanduiding',  # noqa: E501
        'ouder_aanduiding': 'ouderAanduiding',  # noqa: E501
        'datum_ingang_familierechtelijke_betrekking': 'datumIngangFamilierechtelijkeBetrekking',  # noqa: E501
        'naam': 'naam',  # noqa: E501
        'in_onderzoek': 'inOnderzoek',  # noqa: E501
        'geboorte': 'geboorte',  # noqa: E501
        'geheimhouding_persoonsgegevens': 'geheimhoudingPersoonsgegevens',  # noqa: E501
        'links': '_links',  # noqa: E501
    }

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
        '_composed_instances',
        '_var_name_to_model_instances',
        '_additional_properties_model_instances',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """OuderHalBasis - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            burgerservicenummer (str): [optional]  # noqa: E501
            geslachtsaanduiding (GeslachtEnum): [optional]  # noqa: E501
            ouder_aanduiding (OuderAanduidingEnum): [optional]  # noqa: E501
            datum_ingang_familierechtelijke_betrekking (DatumOnvolledig): [optional]  # noqa: E501
            naam (Naam): [optional]  # noqa: E501
            in_onderzoek (OuderInOnderzoek): [optional]  # noqa: E501
            geboorte (Geboorte): [optional]  # noqa: E501
            geheimhouding_persoonsgegevens (bool): Gegevens mogen niet worden verstrekt aan derden / maarschappelijke instellingen. . [optional]  # noqa: E501
            links (OuderLinks): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        constant_args = {
            '_check_type': _check_type,
            '_path_to_item': _path_to_item,
            '_spec_property_naming': _spec_property_naming,
            '_configuration': _configuration,
            '_visited_composed_classes': self._visited_composed_classes,
        }
        required_args = {
        }
        model_args = {}
        model_args.update(required_args)
        model_args.update(kwargs)
        composed_info = validate_get_composed_info(
            constant_args, model_args, self)
        self._composed_instances = composed_info[0]
        self._var_name_to_model_instances = composed_info[1]
        self._additional_properties_model_instances = composed_info[2]
        unused_args = composed_info[3]

        for var_name, var_value in required_args.items():
            setattr(self, var_name, var_value)
        for var_name, var_value in kwargs.items():
            if var_name in unused_args and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        not self._additional_properties_model_instances:
                # discard variable.
                continue
            setattr(self, var_name, var_value)

    @cached_property
    def _composed_schemas():
        # we need this here to make our import statements work
        # we must store _composed_schemas in here so the code is only run
        # when we invoke this method. If we kept this at the class
        # level we would get an error beause the class level
        # code would be run when this module is imported, and these composed
        # classes don't exist yet because their module has not finished
        # loading
        lazy_import()
        return {
          'anyOf': [
          ],
          'allOf': [
              Ouder,
              OuderHalBasisAllOf,
          ],
          'oneOf': [
          ],
        }
