#pragma once

#include "pch.h"
#include "Enums.h"
#include "Fact.h"
#include "BaseCardElement.h"
#include "ElementParserRegistration.h"

AdaptiveSharedNamespaceStart
class BaseCardElement;
class FactSet : public BaseCardElement
{
friend class FactSetParser;
public:
    FactSet();
    FactSet(Spacing spacing, bool separation);
    FactSet(Spacing spacing, bool separation, std::vector<std::shared_ptr<Fact>>& facts);

    virtual Json::Value SerializeToJsonValue() override;

    std::vector<std::shared_ptr<Fact>>& GetFacts();
    const std::vector<std::shared_ptr<Fact>>& GetFacts() const;

private:
    void PopulateKnownPropertiesSet();

    std::vector<std::shared_ptr<Fact>> m_facts; 
};

class FactSetParser : public BaseCardElementParser
{
public:
    std::shared_ptr<BaseCardElement> Deserialize(
        std::shared_ptr<ElementParserRegistration> elementParserRegistration,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration,
        const Json::Value& root);

    std::shared_ptr<BaseCardElement> DeserializeFromString(
        std::shared_ptr<ElementParserRegistration> elementParserRegistration,
        std::shared_ptr<ActionParserRegistration> actionParserRegistration,
        const std::string& jsonString);
};
AdaptiveSharedNamespaceEnd
